package com.upt.candidate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }


    /* @RequestMapping(
            path = "api/v1/candidate",
            method = RequestMethod.GET
    ) */
    @GetMapping("api/v1/candidates")
    public List<Candidate> getCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("api/v1/candidates/{candidateId}")
    public Candidate getCandidate(
            @PathVariable("candidateId") Integer candidateId
    ) {
        return candidateService.getCandidate(candidateId);
    }
}
