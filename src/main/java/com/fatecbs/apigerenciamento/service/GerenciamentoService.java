package com.fatecbs.apigerenciamento.service;

import com.fatecbs.apigerenciamento.model.GerenciamentoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GerenciamentoService implements GerenciamentoServiceTarefa {
    private final Map<Long, GerenciamentoModel> tasks = new HashMap<>();

    @Override
    public List<GerenciamentoModel> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public GerenciamentoModel getTaskById(Long id) {
        return tasks.get(id);
    }

    @Override
    public void createTask(GerenciamentoModel task) {
        tasks.put(task.getId(), task);
    }

    @Override
    public void deleteTask(Long id) {
        tasks.remove(id);
    }

    @Override
    public void updateTask(Long id, GerenciamentoModel updatedTask) {
        tasks.put(id, updatedTask);
    }

    @Override
    public void patchUpdateStatus(Long id, GerenciamentoModel.GerenciamentoModelStatus newStatus) {
        GerenciamentoModel task = tasks.get(id);

        if (task != null) {
            task.setStatus(newStatus);
        }
    }
}

