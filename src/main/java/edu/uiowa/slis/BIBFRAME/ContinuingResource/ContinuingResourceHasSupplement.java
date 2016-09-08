package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasSupplementIterator theContinuingResourceHasSupplementIterator = (ContinuingResourceHasSupplementIterator)findAncestorWithClass(this, ContinuingResourceHasSupplementIterator.class);
			pageContext.getOut().print(theContinuingResourceHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

