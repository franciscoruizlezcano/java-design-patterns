package com.laikacode.patterns.creation.factory.method;

import java.util.HashMap;

public final class Factory {

    private final HashMap<PlanEnum, Plan> planHashMap;

    private static Factory instance;

    public Factory() throws InstantiationException {
        if(instance == null) throw new InstantiationException();

        this.planHashMap = new HashMap<>();

        planHashMap.put(PlanEnum.BASIC, new BasicPlan());
        planHashMap.put(PlanEnum.INTERMEDIATE, new IntermediatePlan());
        planHashMap.put(PlanEnum.EXPERT, new ExpertPlan());
    }

    public static void createInstance() throws InstantiationException {
        if (instance == null) {
            instance = new Factory();
        }
    }

    public Plan create(PlanEnum plan){
        if (plan == null){
            throw new NullPointerException();
        }


        if (this.planHashMap.containsKey(plan)){
            return planHashMap.get(plan);
        }

        return null;
    }
}
