package com.example.schedule.repository;

import com.example.schedule.entity.schedule;
import com.example.schedule.service.Schedule;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScheduleRepository extends JpaRepository<schedule, Long> {
    Optional<Object> findById(Long id);

    Schedule wait(Schedule schedule);
    // 커스텀 쿼리 메서드를 추가할 수 있습니다.
}

