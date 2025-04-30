package com.upt.candidate;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    private final CandidateDao candidateDao;
    public CandidateService(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    public List<Candidate> getAllCandidates() {
        return candidateDao.selectAllCandidates();
    }

    public Candidate getCandidate(Integer id) {
        return candidateDao.selectCandidateById(id).orElseThrow(
                () -> new IllegalArgumentException("Candidate with id [%s] not found".formatted(id))
        );
    }
}
