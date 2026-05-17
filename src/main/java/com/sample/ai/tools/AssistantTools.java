package com.sample.ai.tools;

import dev.langchain4j.agent.tool.Tool;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class AssistantTools {

    /**
     * This tool is available to {@link Assistant}
     */
    @Tool
    @Observed
    public String currentTime() {
        System.out.println("Current time: " + LocalTime.now());
        return LocalTime.now().toString();
    }
}
