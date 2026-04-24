# Workspace Workspace API Specification

---

## Public endpoints

### POST /v1/urd/{id}/push-confluence
- Mô tả: 6. URD Confluence theo `id`
- Auth: không
- Request JSON:

```json
{
  "confluence_url": "...",
  "version": "...",
  "title": "..."
}
```

- Response 200 (object `v1PushUrdConfluenceReply`):

```json
{
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

### GET /v1/workspace/document-sections/{id}
- Mô tả: Lấy thông tin theo `id`
- Auth: không

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### PUT /v1/workspace/document-sections/{id}
- Mô tả: Cập nhật theo `id`
- Auth: không
- Request JSON:

```json
{
  "status": "...",
  "description": "...",
  "confluence_page_id": "...",
  "confluence_url": "...",
  "ref_document_id": "...",
  "task_ref_id": "..."
}
```

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### PUT /v1/workspace/document-sections/{id}/content
- Mô tả: Cập nhật theo `id`
- Auth: không
- Request JSON:

```json
{
  "content": "...",
  "status": "...",
  "expected_version": 1000
}
```

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### GET /v1/workspace/documents/{document_id}/sections
- Mô tả: Lấy thông tin theo `document_id`
- Auth: không

- Response 200 (object `v1ListDocumentSectionsReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "id": "...",
      "document_id": "...",
      "type": "...",
      "status": "...",
      "description": "...",
      "version": 1000,
      "storage_type": "...",
      "storage_ref": "...",
      "content": "...",
      "created_at": "...",
      "updated_at": "...",
      "confluence_page_id": "...",
      "confluence_url": "...",
      "parent_id": "...",
      "approved_at": "...",
      "name": "...",
      "task_ref_id": "...",
      "ref_document_id": "..."
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

### POST /v1/workspace/documents/{document_id}/sections
- Mô tả: Gửi yêu cầu theo `document_id`
- Auth: không
- Request JSON:

```json
{
  "type": "...",
  "description": "...",
  "storage_type": "...",
  "confluence_page_id": "...",
  "confluence_url": "...",
  "parent_id": "...",
  "ref_document_id": "...",
  "task_ref_id": "..."
}
```

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### GET /v1/workspace/documents/{document_id}/sections/current
- Mô tả: Lấy thông tin theo `document_id`
- Auth: không

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### PUT /v1/workspace/documents/{document_id}/sections/current
- Mô tả: Cập nhật theo `document_id`
- Auth: không
- Request JSON:

```json
{
  "section_id": "..."
}
```

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### GET /v1/workspace/documents/{document_id}/sections/versions
- Mô tả: Lấy thông tin theo `document_id`
- Auth: không

- Response 200 (object `v1ListDocumentSectionsReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "id": "...",
      "document_id": "...",
      "type": "...",
      "status": "...",
      "description": "...",
      "version": 1000,
      "storage_type": "...",
      "storage_ref": "...",
      "content": "...",
      "created_at": "...",
      "updated_at": "...",
      "confluence_page_id": "...",
      "confluence_url": "...",
      "parent_id": "...",
      "approved_at": "...",
      "name": "...",
      "task_ref_id": "...",
      "ref_document_id": "..."
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

### POST /v1/workspace/documents/{document_id}/sections/versions
- Mô tả: Gửi yêu cầu theo `document_id`
- Auth: không
- Request JSON:

```json
{
  "type": "...",
  "content": "...",
  "section_id": "..."
}
```

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### GET /v1/workspace/features/{feature_id}/chat
- Mô tả: 4. Chat History theo `feature_id`
- Auth: không

- Response 200 (object `v1ListChatMessagesReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "id": "...",
      "feature_id": "...",
      "session_id": "...",
      "role": "...",
      "content": "...",
      "metadata": "...",
      "created_at": "..."
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

### POST /v1/workspace/features/{feature_id}/chat
- Mô tả: Gửi yêu cầu theo `feature_id`
- Auth: không
- Request JSON:

```json
{
  "session_id": "...",
  "role": "...",
  "content": "...",
  "metadata": "..."
}
```

- Response 200 (object `v1ChatMessageReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "feature_id": "...",
    "session_id": "...",
    "role": "...",
    "content": "...",
    "metadata": "...",
    "created_at": "..."
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

### GET /v1/workspace/features/{feature_id}/documents
- Mô tả: Lấy thông tin theo `feature_id`
- Auth: không

- Response 200 (object `v1ListDocumentsReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "id": "...",
      "feature_id": "...",
      "name": "...",
      "type": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
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

### POST /v1/workspace/features/{feature_id}/documents
- Mô tả: 3. Documents theo `feature_id`
- Auth: không
- Request JSON:

```json
{
  "name": "...",
  "type": "...",
  "description": "...",
  "content": "...",
  "section_type": "..."
}
```

- Response 200 (object `v1DocumentReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "feature_id": "...",
    "name": "...",
    "type": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### GET /v1/workspace/features/{feature_id}/members
- Mô tả: Lấy thông tin theo `feature_id`
- Auth: không

- Response 200 (object `v1ListFeatureMembersReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "feature_id": "...",
      "user_id": "...",
      "role": "...",
      "granted_by": "...",
      "created_at": "...",
      "updated_at": "..."
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

### POST /v1/workspace/features/{feature_id}/members
- Mô tả: Gửi yêu cầu theo `feature_id`
- Auth: không
- Request JSON:

```json
{
  "user_id": "...",
  "role": "..."
}
```

- Response 200 (object `v1FeatureMemberReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "feature_id": "...",
    "user_id": "...",
    "role": "...",
    "granted_by": "...",
    "created_at": "...",
    "updated_at": "..."
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

### DELETE /v1/workspace/features/{feature_id}/members/{user_id}
- Mô tả: Xóa
- Auth: không

- Response 200 (object `v1EmptyReply`):

```json
{
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

### PUT /v1/workspace/features/{feature_id}/members/{user_id}
- Mô tả: Cập nhật
- Auth: không
- Request JSON:

```json
{
  "role": "..."
}
```

- Response 200 (object `v1FeatureMemberReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "feature_id": "...",
    "user_id": "...",
    "role": "...",
    "granted_by": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /v1/workspace/features/{feature_id}/upsert-document
- Mô tả: Gửi yêu cầu theo `feature_id`
- Auth: không
- Request JSON:

```json
{
  "doc_type": "...",
  "section_type": "...",
  "content": "...",
  "document_id": "...",
  "section_id": "...",
  "metadata_json": "..."
}
```

- Response 200 (object `v1DocumentSectionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "document_id": "...",
    "type": "...",
    "status": "...",
    "description": "...",
    "version": 1000,
    "storage_type": "...",
    "storage_ref": "...",
    "content": "...",
    "created_at": "...",
    "updated_at": "...",
    "confluence_page_id": "...",
    "confluence_url": "...",
    "parent_id": "...",
    "approved_at": "...",
    "name": "...",
    "task_ref_id": "...",
    "ref_document_id": "..."
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

### DELETE /v1/workspace/features/{id}
- Mô tả: Xóa theo `id`
- Auth: không

- Response 200 (object `v1EmptyReply`):

```json
{
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

### GET /v1/workspace/features/{id}
- Mô tả: Lấy thông tin theo `id`
- Auth: không

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "current_step": "...",
    "progress": "...",
    "order": 1000,
    "created_at": "...",
    "updated_at": "...",
    "is_feature_group": true,
    "current_phase": "...",
    "has_prd_detail": true
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

### PUT /v1/workspace/features/{id}
- Mô tả: Cập nhật theo `id`
- Auth: không
- Request JSON:

```json
{
  "parent_id": "...",
  "name": "...",
  "description": "...",
  "status": "...",
  "progress": "...",
  "order": 1000,
  "current_phase": "...",
  "current_step": "..."
}
```

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "current_step": "...",
    "progress": "...",
    "order": 1000,
    "created_at": "...",
    "updated_at": "...",
    "is_feature_group": true,
    "current_phase": "...",
    "has_prd_detail": true
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

### GET /v1/workspace/projects
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1ListProjectsReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "id": "...",
      "user_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "confluence_config": {
        "enabled": true,
        "space_key": "...",
        "parent_page_id": "..."
      },
      "created_at": "...",
      "updated_at": "...",
      "user_role": "...",
      "overview": {
        "status": true
      }
    }
  ],
  "next_page_token": "..."
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

### POST /v1/workspace/projects
- Mô tả: 1. Projects
- Auth: không
- Request JSON:

```json
{
  "name": "...",
  "description": "...",
  "confluence_config": {
    "enabled": true,
    "space_key": "...",
    "parent_page_id": "..."
  }
}
```

- Response 200 (object `v1ProjectReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "user_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    },
    "created_at": "...",
    "updated_at": "...",
    "user_role": "...",
    "overview": {
      "status": true
    }
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

### DELETE /v1/workspace/projects/{id}
- Mô tả: Xóa theo `id`
- Auth: không

- Response 200 (object `v1EmptyReply`):

```json
{
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

### GET /v1/workspace/projects/{id}
- Mô tả: Lấy thông tin theo `id`
- Auth: không

- Response 200 (object `v1ProjectReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "user_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    },
    "created_at": "...",
    "updated_at": "...",
    "user_role": "...",
    "overview": {
      "status": true
    }
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

### PUT /v1/workspace/projects/{id}
- Mô tả: Cập nhật theo `id`
- Auth: không
- Request JSON:

```json
{
  "name": "...",
  "description": "...",
  "status": "...",
  "confluence_config": {
    "enabled": true,
    "space_key": "...",
    "parent_page_id": "..."
  }
}
```

- Response 200 (object `v1ProjectReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "user_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    },
    "created_at": "...",
    "updated_at": "...",
    "user_role": "...",
    "overview": {
      "status": true
    }
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

### POST /v1/workspace/projects/{project_id}/feature-groups
- Mô tả: Gửi yêu cầu theo `project_id`
- Auth: không
- Request JSON:

```json
{
  "parent_id": "...",
  "name": "...",
  "description": "...",
  "order": 1000
}
```

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "current_step": "...",
    "progress": "...",
    "order": 1000,
    "created_at": "...",
    "updated_at": "...",
    "is_feature_group": true,
    "current_phase": "...",
    "has_prd_detail": true
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

### GET /v1/workspace/projects/{project_id}/features
- Mô tả: 2. Features theo `project_id`
- Auth: không

- Response 200 (object `v1GetFeatureTreeReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "id": "...",
      "project_id": "...",
      "parent_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "current_step": "...",
      "progress": "...",
      "order": 1000,
      "created_at": "...",
      "updated_at": "...",
      "is_feature_group": true,
      "current_phase": "...",
      "has_prd_detail": true
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

### POST /v1/workspace/projects/{project_id}/features
- Mô tả: Gửi yêu cầu theo `project_id`
- Auth: không
- Request JSON:

```json
{
  "parent_id": "...",
  "name": "...",
  "description": "...",
  "order": 1000,
  "is_feature_group": true
}
```

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "current_step": "...",
    "progress": "...",
    "order": 1000,
    "created_at": "...",
    "updated_at": "...",
    "is_feature_group": true,
    "current_phase": "...",
    "has_prd_detail": true
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

### GET /v1/workspace/projects/{project_id}/members
- Mô tả: Lấy thông tin theo `project_id`
- Auth: không

- Response 200 (object `v1ListProjectMembersReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "project_id": "...",
      "user_id": "...",
      "role": "...",
      "created_at": "...",
      "name": "...",
      "email": "..."
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

### POST /v1/workspace/projects/{project_id}/members
- Mô tả: 1.6 & 1.7 Project Members theo `project_id`
- Auth: không
- Request JSON:

```json
{
  "user_id": "...",
  "role": "..."
}
```

- Response 200 (object `v1ProjectMemberReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "project_id": "...",
    "user_id": "...",
    "role": "...",
    "created_at": "...",
    "name": "...",
    "email": "..."
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

### DELETE /v1/workspace/projects/{project_id}/members/{user_id}
- Mô tả: Xóa
- Auth: không

- Response 200 (object `v1EmptyReply`):

```json
{
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

### PUT /v1/workspace/projects/{project_id}/members/{user_id}
- Mô tả: Cập nhật
- Auth: không
- Request JSON:

```json
{
  "role": "..."
}
```

- Response 200 (object `v1ProjectMemberReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "project_id": "...",
    "user_id": "...",
    "role": "...",
    "created_at": "...",
    "name": "...",
    "email": "..."
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

### GET /v1/workspace/projects/{project_id}/root-feature
- Mô tả: Lấy thông tin theo `project_id`
- Auth: không

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "current_step": "...",
    "progress": "...",
    "order": 1000,
    "created_at": "...",
    "updated_at": "...",
    "is_feature_group": true,
    "current_phase": "...",
    "has_prd_detail": true
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

### GET /v1/workspace/projects/{project_id}/sessions
- Mô tả: Lấy thông tin theo `project_id`
- Auth: không

- Response 200 (object `v1ListSessionsReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": [
    {
      "id": "...",
      "project_id": "...",
      "current_feature_id": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
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

### POST /v1/workspace/projects/{project_id}/sessions
- Mô tả: 5. Sessions theo `project_id`
- Auth: không
- Request JSON:

```json
{}
```

- Response 200 (object `v1SessionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "current_feature_id": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### GET /v1/workspace/sessions/{id}
- Mô tả: Lấy thông tin theo `id`
- Auth: không

- Response 200 (object `v1SessionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "current_feature_id": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### PUT /v1/workspace/sessions/{id}/context
- Mô tả: Cập nhật theo `id`
- Auth: không
- Request JSON:

```json
{
  "current_feature_id": "..."
}
```

- Response 200 (object `v1EmptyReply`):

```json
{
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

---

## Notes chung / Behaviour
- Server sử dụng in-memory stores (maps) cho dữ liệu. Dữ liệu sẽ mất khi server dừng.
- Một vài sample data có thể được seed sẵn để test.

---

End of spec.
