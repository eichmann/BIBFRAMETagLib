package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographDerivedFromIterator theMultipartMonographDerivedFromIterator = (MultipartMonographDerivedFromIterator)findAncestorWithClass(this, MultipartMonographDerivedFromIterator.class);
			pageContext.getOut().print(theMultipartMonographDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

