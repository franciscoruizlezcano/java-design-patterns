package com.laikacode.patterns.creation.factory.method;

import java.util.HashMap;

public final class PlanFactory {

    private final HashMap<PlanEnum, Plan> planHashMap;

    private static PlanFactory instance;

    private PlanFactory() {
        this.planHashMap = new HashMap<>(){{
            put(PlanEnum.BASIC, new BasicPlan());
            put(PlanEnum.INTERMEDIATE, new IntermediatePlan());
            put(PlanEnum.EXPERT, new ExpertPlan());
        }};
    }

    public static void createInstance() {
        if (instance == null) {
            instance = new PlanFactory();
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
