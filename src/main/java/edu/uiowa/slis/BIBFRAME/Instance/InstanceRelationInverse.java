package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceRelationInverseIterator theInstanceRelationInverseIterator = (InstanceRelationInverseIterator)findAncestorWithClass(this, InstanceRelationInverseIterator.class);
			pageContext.getOut().print(theInstanceRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for relation tag ");
		}
		return SKIP_BODY;
	}
}

