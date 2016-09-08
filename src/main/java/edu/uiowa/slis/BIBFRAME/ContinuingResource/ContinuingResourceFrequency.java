package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceFrequencyIterator theContinuingResource = (ContinuingResourceFrequencyIterator)findAncestorWithClass(this, ContinuingResourceFrequencyIterator.class);
			pageContext.getOut().print(theContinuingResource.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for frequency tag ");
		}
		return SKIP_BODY;
	}
}

