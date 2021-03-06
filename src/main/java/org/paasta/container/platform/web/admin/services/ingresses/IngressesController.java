package org.paasta.container.platform.web.admin.services.ingresses;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.paasta.container.platform.web.admin.common.ConstantsUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Ingresses Controller 클래스
 *
 * @author jjy
 * @version 1.0
 * @since 2022.05.17
 */
@Api(value = "IngressesController v1")
@Controller
public class IngressesController {

    private static final String BASE_URL = "ingresses/";

    /**
     * Ingresses 목록 페이지 이동(Go to the ingresses list page)
     *
     * @return the view
     */
    @ApiOperation(value = "Ingresses 목록 페이지 이동(Go to the ingresses list page)", nickname = "getIngressesList")
    @GetMapping(value = ConstantsUrl.URI_CP_SERVICES_INGRESSES )
    public String getIngressesList(){
        return BASE_URL + "ingresses";}

    /**
     * Ingresses 상세 페이지 이동(Go to the ingresses details page)
     *
     * @return the view
     */
    @ApiOperation(value = "Ingresses 상세 페이지 이동(Go to the ingresses details page)", nickname = "getIngressesDetails")
    @GetMapping(value = ConstantsUrl.URI_CP_SERVICES_INGRESSES + ConstantsUrl.URI_CP_DETAILS)
    public String getIngressesDetails(){return
            BASE_URL + "ingressesDetail";}
}
