# Testing graceful shutdown for Springboot

# Properties to enable graceful shutdown and to configure grace period

<pre><code>
server.shutdown=graceful
spring.lifecycle.timeout-per-shutdown-phase=2m
</code></pre>