package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationTopConceptOfIterator theUdcClassificationTopConceptOfIterator = (UdcClassificationTopConceptOfIterator)findAncestorWithClass(this, UdcClassificationTopConceptOfIterator.class);
			pageContext.getOut().print(theUdcClassificationTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

