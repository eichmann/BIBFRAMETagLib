package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageAccompaniesIterator theStillImageAccompaniesIterator = (StillImageAccompaniesIterator)findAncestorWithClass(this, StillImageAccompaniesIterator.class);
			pageContext.getOut().print(theStillImageAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

