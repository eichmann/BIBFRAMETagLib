package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsPartOfIterator theContinuingResourceIsPartOfIterator = (ContinuingResourceIsPartOfIterator)findAncestorWithClass(this, ContinuingResourceIsPartOfIterator.class);
			pageContext.getOut().print(theContinuingResourceIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

