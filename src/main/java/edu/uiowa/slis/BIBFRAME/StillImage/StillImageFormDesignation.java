package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StillImageFormDesignationIterator theStillImage = (StillImageFormDesignationIterator)findAncestorWithClass(this, StillImageFormDesignationIterator.class);
			pageContext.getOut().print(theStillImage.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

