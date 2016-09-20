package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographFormDesignationIterator theMultipartMonograph = (MultipartMonographFormDesignationIterator)findAncestorWithClass(this, MultipartMonographFormDesignationIterator.class);
			pageContext.getOut().print(theMultipartMonograph.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

