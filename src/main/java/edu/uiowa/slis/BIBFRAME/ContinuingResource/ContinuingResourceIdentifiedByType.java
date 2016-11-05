package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIdentifiedByIterator theContinuingResourceIdentifiedByIterator = (ContinuingResourceIdentifiedByIterator)findAncestorWithClass(this, ContinuingResourceIdentifiedByIterator.class);
			pageContext.getOut().print(theContinuingResourceIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

