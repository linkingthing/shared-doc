# http缓存

## 意义

- 减少带宽
- 降低网络负荷

## 原理

> 报文结构（首行，header，body）

>  浏览器访问一个链接的流程，优先访问浏览器缓存

- 强制缓存

  - http1.1

    - cache-control
      - max-age （单位秒）
      - no-store（不缓存）
      - no-cache（缓存，但是要验证，协商缓存）
      - 是否允许中途代理缓存【private，public】
  - http1.0
    - expires 
  
- 协商缓存
  - 更新时间
    - last-modified
    - if-modified-since
  - 内容比对 304,只返回响应头，不返回报文体
    - etag
    - if-no-match
