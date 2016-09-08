package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasPartIterator theMultipartMonographHasPartIterator = (MultipartMonographHasPartIterator)findAncestorWithClass(this, MultipartMonographHasPartIterator.class);
			pageContext.getOut().print(theMultipartMonographHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

