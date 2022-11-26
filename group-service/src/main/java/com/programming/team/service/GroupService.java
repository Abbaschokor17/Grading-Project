package com.programming.team.service;

import com.programming.team.dto.GroupLineStudentsDto;
import com.programming.team.dto.GroupRequest;
import com.programming.team.dto.GroupResponse;
import com.programming.team.model.Group;
import com.programming.team.model.GroupLineStudents;
import com.programming.team.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class GroupService {

    private final GroupRepository groupRepository;

    public void placeGroup(GroupRequest groupRequest) {

        Group group = new Group();
        group.setGroupUniqueNumber(UUID.randomUUID().toString());

        List<GroupLineStudents> groupLineStudents = groupRequest.getGroupLineStudentsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();
        group.setGroupLineStudentsList(groupLineStudents);

        groupRepository.save(group);
    }

    private GroupLineStudents mapToDto(GroupLineStudentsDto groupLineStudentsDto) {
        GroupLineStudents groupLineStudents = new GroupLineStudents();
        groupLineStudents.setMatricule(groupLineStudentsDto.getMatricule());
        groupLineStudents.setFullnamestudent(groupLineStudentsDto.getFullnamestudent());
        return groupLineStudents;
    }

    public void deleteGroup(GroupResponse groupResponse) {
        Group group = new Group();
        group.setId(groupResponse.getId());
        List<GroupLineStudents> groupLineStudents = groupResponse.getGroupLineStudentsDtoList()
                .stream()
                .map(this::mapTodelete)
                .toList();
        group.setGroupLineStudentsList(groupLineStudents);
        groupRepository.delete(group);
        log.info("Group {} is deleted", group.getId());
    }
    private GroupLineStudents mapTodelete(GroupLineStudentsDto groupLineStudentsDto) {
        GroupLineStudents groupLineStudents = new GroupLineStudents();
        groupLineStudents.setId(groupLineStudentsDto.getId());
        return groupLineStudents;
    }

    public List<GroupResponse> getAllGroups() {
        List<Group> groups = groupRepository.findAll();

        return groups.stream().map(this::mapToGroupResponse).toList();
    }

    private GroupResponse mapToGroupResponse(Group group) {
        GroupResponse groupResponse = new GroupResponse();

        return groupResponse.builder()
                .id(group.getId())
                .GroupUniqueNumber(group.getGroupUniqueNumber())

                .build();
    }
    public List<Group> findAll() {
        return groupRepository.findAll();
    }


}
