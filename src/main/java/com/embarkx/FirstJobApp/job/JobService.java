package com.embarkx.FirstJobApp.job;

import java.util.List;

public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    Job getJobById(Long id);
    boolean deleteJobById(Long id);

    void updateJob(Long id, Job job);
}
