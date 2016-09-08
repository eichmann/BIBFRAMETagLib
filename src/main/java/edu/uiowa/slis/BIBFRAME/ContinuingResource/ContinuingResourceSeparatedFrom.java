package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceSeparatedFromIterator theContinuingResourceSeparatedFromIterator = (ContinuingResourceSeparatedFromIterator)findAncestorWithClass(this, ContinuingResourceSeparatedFromIterator.class);
			pageContext.getOut().print(theContinuingResourceSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

