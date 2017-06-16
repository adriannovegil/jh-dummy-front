package es.devcircus.jhdummy.service.mapper;

import es.devcircus.jhdummy.domain.*;
import es.devcircus.jhdummy.service.dto.RegionDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Region and its DTO RegionDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface RegionMapper extends EntityMapper <RegionDTO, Region> {
    
    
    default Region fromId(Long id) {
        if (id == null) {
            return null;
        }
        Region region = new Region();
        region.setId(id);
        return region;
    }
}
