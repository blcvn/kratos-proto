# Ba-Agent Ba_Agent API Specification

---

## Public endpoints

### POST /agent/execute
- Mô tả: Task Execution
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "max_iterations": 1000
  }
}
```

- Response 200 (object `v1ExecuteTaskResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### DELETE /agent/memory/{session_id}
- Mô tả: Xóa theo `session_id`
- Auth: không

- Response 200 (object `v1ClearMemoryResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### GET /agent/memory/{session_id}
- Mô tả: Memory theo `session_id`
- Auth: không

- Response 200 (object `v1GetMemoryResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "memory": {
    "session_id": "...",
    "short_term": [
      "..."
    ],
    "long_term_ids": [
      "..."
    ]
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### GET /agent/tasks/{task_id}
- Mô tả: Lấy thông tin theo `task_id`
- Auth: không

- Response 200 (object `v1GetTaskResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### GET /agent/tools
- Mô tả: Tools
- Auth: không

- Response 200 (object `v1ListToolsResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "tools": [
    {
      "name": "...",
      "description": "...",
      "input_schema": "..."
    }
  ]
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

---

## Notes chung / Behaviour
- Server sử dụng in-memory stores (maps) cho dữ liệu. Dữ liệu sẽ mất khi server dừng.
- Một vài sample data có thể được seed sẵn để test.

---

End of spec.
