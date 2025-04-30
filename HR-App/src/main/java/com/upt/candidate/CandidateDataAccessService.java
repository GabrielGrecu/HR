package com.upt.candidate;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CandidateDataAccessService implements CandidateDao {

    private static List<Candidate> candidates;

    static {
        candidates = new ArrayList<>();

        Candidate alex = new Candidate(
                1,
                "Alex",
                "alex@gmail.com",
                25
        );
        Candidate jamila = new Candidate(
                2,
                "Jamila",
                "jamila@gmail.com",
                25
        );
        candidates.add(alex);
        candidates.add(jamila);
    }

    @Override
    public List<Candidate> selectAllCandidates() {
        return candidates;
    }

    @Override
    public Optional<Candidate> selectCandidateById(Integer id) {
        return candidates.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();

    }
}
