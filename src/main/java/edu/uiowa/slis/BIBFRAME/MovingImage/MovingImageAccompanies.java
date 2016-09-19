package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageAccompaniesIterator theMovingImageAccompaniesIterator = (MovingImageAccompaniesIterator)findAncestorWithClass(this, MovingImageAccompaniesIterator.class);
			pageContext.getOut().print(theMovingImageAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

