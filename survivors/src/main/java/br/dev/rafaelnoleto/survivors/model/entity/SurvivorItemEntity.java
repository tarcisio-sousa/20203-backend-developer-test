package br.dev.rafaelnoleto.survivors.model.entity;

import java.util.HashMap;

/**
 *
 * @author rafaelnoleto
 */
public class SurvivorItemEntity extends Entity {

    public SurvivorItemEntity(HashMap<String, Object> data) {
        super((int) data.get("id"));
        this.survivorId = (int) data.get("survivorId");
        this.itemId = (int) data.get("itemId");
    }

    private Integer survivorId;
    private Integer itemId;

    public Integer getSurvivorId() {
        return survivorId;
    }

    public void setSurvivorId(Integer survivorId) {
        this.survivorId = survivorId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

}
