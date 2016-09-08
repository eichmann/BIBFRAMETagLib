package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasInstanceIterator theMultipartMonographHasInstanceIterator = (MultipartMonographHasInstanceIterator)findAncestorWithClass(this, MultipartMonographHasInstanceIterator.class);
			pageContext.getOut().print(theMultipartMonographHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

