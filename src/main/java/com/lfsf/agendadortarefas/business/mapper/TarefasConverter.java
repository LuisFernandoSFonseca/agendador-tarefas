package com.lfsf.agendadortarefas.business.mapper;

import com.lfsf.agendadortarefas.business.dto.TarefasDTO;
import com.lfsf.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
