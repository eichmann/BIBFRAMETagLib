package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasAnnotationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasAnnotationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasAnnotationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasAnnotationIterator theElectronicHasAnnotationIterator = (ElectronicHasAnnotationIterator)findAncestorWithClass(this, ElectronicHasAnnotationIterator.class);
			pageContext.getOut().print(theElectronicHasAnnotationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}
