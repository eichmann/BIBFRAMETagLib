package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasAbsorbedIterator theMultipartMonographHasAbsorbedIterator = (MultipartMonographHasAbsorbedIterator)findAncestorWithClass(this, MultipartMonographHasAbsorbedIterator.class);
			pageContext.getOut().print(theMultipartMonographHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

