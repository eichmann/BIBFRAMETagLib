package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationTopConceptOfIterator theUdcClassificationTopConceptOfIterator = (UdcClassificationTopConceptOfIterator)findAncestorWithClass(this, UdcClassificationTopConceptOfIterator.class);
			pageContext.getOut().print(theUdcClassificationTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

