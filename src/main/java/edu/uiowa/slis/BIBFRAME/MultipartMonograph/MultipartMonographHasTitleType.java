package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasTitleIterator theMultipartMonographHasTitleIterator = (MultipartMonographHasTitleIterator)findAncestorWithClass(this, MultipartMonographHasTitleIterator.class);
			pageContext.getOut().print(theMultipartMonographHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}
