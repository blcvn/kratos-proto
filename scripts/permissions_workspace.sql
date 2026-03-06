-- ===========================================
-- Workspace Service Permissions
-- Generated from schema/workspace/workspace.proto
-- ===========================================

-- 1. Projects
INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000020'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Create Project',
    'Create a new project',
    1,
    1,
    '/v1/workspace/projects',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000021'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'List Projects',
    'List all projects',
    1,
    1,
    '/v1/workspace/projects',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000022'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Get Project',
    'Get project by ID',
    1,
    1,
    '/v1/workspace/projects/{id}',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000023'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Update Project',
    'Update project by ID',
    1,
    1,
    '/v1/workspace/projects/{id}',
    'PUT',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000024'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Delete Project',
    'Delete project by ID',
    1,
    1,
    '/v1/workspace/projects/{id}',
    'DELETE',
    NOW()
) ON CONFLICT (id) DO NOTHING;

-- 2. Project Members
INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000025'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Add Project Member',
    'Add a member to project',
    1,
    1,
    '/v1/workspace/projects/{project_id}/members',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000026'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Remove Project Member',
    'Remove a member from project',
    1,
    1,
    '/v1/workspace/projects/{project_id}/members/{user_id}',
    'DELETE',
    NOW()
) ON CONFLICT (id) DO NOTHING;

-- 3. Features
INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000027'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Get Feature Tree',
    'Get feature tree by project',
    1,
    1,
    '/v1/workspace/projects/{project_id}/features',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000028'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Create Feature',
    'Create a new feature',
    1,
    1,
    '/v1/workspace/projects/{project_id}/features',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000029'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Create Feature Group',
    'Create a new feature group',
    1,
    1,
    '/v1/workspace/projects/{project_id}/feature-groups',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000030'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Get Feature',
    'Get feature by ID',
    1,
    1,
    '/v1/workspace/features/{id}',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000031'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Update Feature',
    'Update feature by ID',
    1,
    1,
    '/v1/workspace/features/{id}',
    'PUT',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000032'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Delete Feature',
    'Delete feature by ID',
    1,
    1,
    '/v1/workspace/features/{id}',
    'DELETE',
    NOW()
) ON CONFLICT (id) DO NOTHING;

-- 4. Documents
INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000033'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Create Document',
    'Create a new document',
    1,
    1,
    '/v1/workspace/features/{feature_id}/documents',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000034'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'List Documents',
    'List documents by feature',
    1,
    1,
    '/v1/workspace/features/{feature_id}/documents',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000035'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'List Document Sections',
    'List sections of a document',
    1,
    1,
    '/v1/workspace/documents/{document_id}/sections',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000036'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Get Document Section',
    'Get document section by ID',
    1,
    1,
    '/v1/workspace/document-sections/{id}',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000037'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Create Document Section',
    'Create a new document section',
    1,
    1,
    '/v1/workspace/documents/{document_id}/sections',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000038'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Update Document Section',
    'Update document section by ID',
    1,
    1,
    '/v1/workspace/document-sections/{id}',
    'PUT',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000039'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Update Document Section Content',
    'Update document section content by ID',
    1,
    1,
    '/v1/workspace/document-sections/{id}/content',
    'PUT',
    NOW()
) ON CONFLICT (id) DO NOTHING;

-- 5. Chat History
INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000040'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'List Chat Messages',
    'List chat messages by feature',
    1,
    1,
    '/v1/workspace/features/{feature_id}/chat',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000041'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Append Chat Message',
    'Append a chat message to feature',
    1,
    1,
    '/v1/workspace/features/{feature_id}/chat',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

-- 6. Sessions
INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000042'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Create Session',
    'Create a new session',
    1,
    1,
    '/v1/workspace/projects/{project_id}/sessions',
    'POST',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000043'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Update Session Context',
    'Update session context by ID',
    1,
    1,
    '/v1/workspace/sessions/{id}/context',
    'PUT',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000044'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'Get Session',
    'Get session by ID',
    1,
    1,
    '/v1/workspace/sessions/{id}',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;

INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES (
    '00000000-0000-0000-0000-000000000045'::uuid,
    'ba000000-0000-0000-0000-000000000001'::uuid,
    'List Project Sessions',
    'List sessions by project',
    1,
    1,
    '/v1/workspace/projects/{project_id}/sessions',
    'GET',
    NOW()
) ON CONFLICT (id) DO NOTHING;
