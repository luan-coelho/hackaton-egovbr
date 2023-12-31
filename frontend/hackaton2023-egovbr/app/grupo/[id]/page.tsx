"use client";

import { Button } from "@/components/ui/button";
import { DialogFooter } from "@/components/ui/dialog";
import React from "react";

import { FormProvider, useForm } from "react-hook-form";
import { z } from "zod";
import { zodResolver } from "@hookform/resolvers/zod";
import { Form } from "@/components/form";
import { registerLocale } from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";

import pt from "date-fns/locale/pt";
import { Grupo } from "@/types";
import api from "@/services/api";
import { redirect, useRouter } from "next/navigation";
import { useFetch } from "@/hooks/useFetch";

registerLocale("pt", pt);

export default function EditarGrupo({ params }: {
  params: {
    id: number
  }
}) {
  const router = useRouter();

  const { data, isLoading } = useFetch<Grupo>(`http://localhost:8080/grupo/${params.id}`);

  const schema = z.object({
    titulo: z.string()
      .nonempty("O título é obrigatório"),
    imagem: z.string()
      .nonempty("Informe um link da imagem"),
  });

  const createGrupo = useForm<Grupo>({
    resolver: zodResolver(schema),
    defaultValues: {
      id: data?.id,
      imagem: data?.imagem,
      titulo: data?.titulo,
    },
  });

  const { handleSubmit } = createGrupo;

  async function atualizarGrupo(grupo: Grupo) {
    await api.put(`http://localhost:8080/grupo/${data?.id}`, grupo);
    router.push("/grupo");
  }

  // async function deletarGrupo() {
  //   await api.delete(`http://localhost:8080/grupo/${data?.id}`);
  //   router.push("/grupo");
  // }

  return (
    <>{!isLoading &&
      <FormProvider {...createGrupo}>
        <form onSubmit={handleSubmit(atualizarGrupo)} className="grid gap-4">
          <Form.Field>
            <Form.Label htmlFor="titulo">
              Título
            </Form.Label>
            <Form.TextField name="titulo" defaultValue={data?.titulo} />
            <Form.ErrorMessage field="titulo" />
          </Form.Field>
          <Form.Field>
            <Form.Label htmlFor="imagem">
              URL da imagem
            </Form.Label>
            <Form.TextField name="imagem" defaultValue={data?.imagem} />
            <Form.ErrorMessage field="imagem" />
          </Form.Field>
          <DialogFooter className="flex gap-1">
            {/*<Button onClick={deletarGrupo} className="bg-red-600 text-white" type="submit">*/}
            {/*  Deletar*/}
            {/*</Button>*/}
            <Button className="bg-blue-600 text-white" type="submit">
              Atualizar
            </Button>
          </DialogFooter>
        </form>
      </FormProvider>
    }
    </>
  );
}