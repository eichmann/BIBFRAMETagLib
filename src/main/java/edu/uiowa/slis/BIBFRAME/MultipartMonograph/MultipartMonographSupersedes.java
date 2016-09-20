package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSupersedesIterator theMultipartMonographSupersedesIterator = (MultipartMonographSupersedesIterator)findAncestorWithClass(this, MultipartMonographSupersedesIterator.class);
			pageContext.getOut().print(theMultipartMonographSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

