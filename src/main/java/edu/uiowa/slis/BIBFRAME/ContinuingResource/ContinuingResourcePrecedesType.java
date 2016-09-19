package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourcePrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourcePrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourcePrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourcePrecedesIterator theContinuingResourcePrecedesIterator = (ContinuingResourcePrecedesIterator)findAncestorWithClass(this, ContinuingResourcePrecedesIterator.class);
			pageContext.getOut().print(theContinuingResourcePrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for precedes tag ");
		}
		return SKIP_BODY;
	}
}

