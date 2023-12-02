# Testing graceful shutdown for Springboot

# Properties to enable graceful shutdown and to configure grace period

<pre><code>
server.shutdown=graceful
spring.lifecycle.timeout-per-shutdown-phase=2m
</code></pre>

## Testing
<p>
curl http://localhost:8080/hello for simulation longer task, then kill -15 #PID to wait active 
request completed.
</p>
