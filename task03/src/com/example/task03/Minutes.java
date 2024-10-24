package com.example.task03;

public class Minutes implements TimeUnit {
    private final long amount;
    public Minutes(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return Math.round(amount*60000f);
    }

    @Override
    public long toSeconds() {
        return Math.round(amount*60f);
    }

    @Override
    public long toMinutes() {
       return amount;
    }
    @Override
    public long toHours() {
        return Math.round(amount / 60f);
    }
}
