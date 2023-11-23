package com.fatecbs.apigerenciamento.model;

import java.time.LocalDate;

public class GerenciamentoModel {
    private Long id;
    private String title;
    private String description;
    private GerenciamentoModelStatus status;
    private LocalDate dueDate;
    private GerenciamentoModelPriority priority;

    // Construtores
    public GerenciamentoModel() {
        // Construtor padrão
    }

    public GerenciamentoModel(Long id, String title, String description, GerenciamentoModelStatus status, LocalDate dueDate, GerenciamentoModelPriority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GerenciamentoModelStatus getStatus() {
        return status;
    }

    public void setStatus(GerenciamentoModelStatus status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public GerenciamentoModelPriority getPriority() {
        return priority;
    }

    public void setPriority(GerenciamentoModelPriority priority) {
        this.priority = priority;
    }
    
    public enum GerenciamentoModelStatus {
        TODO, IN_PROGRESS, DONE
    }

    public enum GerenciamentoModelPriority {
        LOW, MEDIUM, HIGH
    }
}