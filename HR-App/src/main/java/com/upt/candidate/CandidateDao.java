package com.upt.candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateDao {
    List<Candidate> selectAllCandidates();
    Optional<Candidate> selectCandidateById(Integer id);
}
