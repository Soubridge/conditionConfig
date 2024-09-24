package org.lzssl.condition;

public class LinuxShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "ls";
    }
}
