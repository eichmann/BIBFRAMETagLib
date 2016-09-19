package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicRelationIterator theElectronicRelationIterator = (ElectronicRelationIterator)findAncestorWithClass(this, ElectronicRelationIterator.class);
			pageContext.getOut().print(theElectronicRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for relation tag ");
		}
		return SKIP_BODY;
	}
}

