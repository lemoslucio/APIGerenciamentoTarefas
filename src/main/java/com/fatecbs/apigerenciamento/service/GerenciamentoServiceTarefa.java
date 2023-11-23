package com.fatecbs.apigerenciamento.service;

import com.fatecbs.apigerenciamento.model.GerenciamentoModel;

import java.util.List;

public interface GerenciamentoServiceTarefa {
    List<GerenciamentoModel> getAllTasks();
    GerenciamentoModel getTaskById(Long id);
    void createTask(GerenciamentoModel task);
    void deleteTask(Long id);
    void updateTask(Long id, GerenciamentoModel updatedTask);
    void patchUpdateStatus(Long id, GerenciamentoModel.GerenciamentoModelStatus newStatus);
}
