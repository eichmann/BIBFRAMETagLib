package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasPartIterator theContinuingResourceHasPartIterator = (ContinuingResourceHasPartIterator)findAncestorWithClass(this, ContinuingResourceHasPartIterator.class);
			pageContext.getOut().print(theContinuingResourceHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

