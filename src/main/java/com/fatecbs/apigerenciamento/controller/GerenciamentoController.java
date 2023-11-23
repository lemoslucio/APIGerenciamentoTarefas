package com.fatecbs.apigerenciamento.controller;

import com.fatecbs.apigerenciamento.model.GerenciamentoModel;
import com.fatecbs.apigerenciamento.service.GerenciamentoServiceTarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class GerenciamentoController {
    @Autowired
    private GerenciamentoServiceTarefa taskService;

    @GetMapping
    public List<GerenciamentoModel> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public GerenciamentoModel getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public void createTask(@RequestBody GerenciamentoModel task) {
        taskService.createTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}")
    public void updateTask(@PathVariable Long id, @RequestBody GerenciamentoModel updatedTask) {
        taskService.updateTask(id, updatedTask);
    }

    @PatchMapping("/{id}/status")
    public void patchUpdateStatus(@PathVariable Long id, @RequestParam GerenciamentoModel.GerenciamentoModelStatus newStatus) {
        taskService.patchUpdateStatus(id, newStatus);
    }
}
