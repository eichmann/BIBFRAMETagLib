package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIdentifiedByIterator theContinuingResourceIdentifiedByIterator = (ContinuingResourceIdentifiedByIterator)findAncestorWithClass(this, ContinuingResourceIdentifiedByIterator.class);
			pageContext.getOut().print(theContinuingResourceIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

