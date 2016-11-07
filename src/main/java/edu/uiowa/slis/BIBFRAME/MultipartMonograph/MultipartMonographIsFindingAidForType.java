package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographIsFindingAidForIterator theMultipartMonographIsFindingAidForIterator = (MultipartMonographIsFindingAidForIterator)findAncestorWithClass(this, MultipartMonographIsFindingAidForIterator.class);
			pageContext.getOut().print(theMultipartMonographIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}
