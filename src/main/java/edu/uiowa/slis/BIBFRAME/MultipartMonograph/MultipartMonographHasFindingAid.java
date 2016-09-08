package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasFindingAidIterator theMultipartMonographHasFindingAidIterator = (MultipartMonographHasFindingAidIterator)findAncestorWithClass(this, MultipartMonographHasFindingAidIterator.class);
			pageContext.getOut().print(theMultipartMonographHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

