package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceFormDesignationIterator theContinuingResource = (ContinuingResourceFormDesignationIterator)findAncestorWithClass(this, ContinuingResourceFormDesignationIterator.class);
			pageContext.getOut().print(theContinuingResource.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

