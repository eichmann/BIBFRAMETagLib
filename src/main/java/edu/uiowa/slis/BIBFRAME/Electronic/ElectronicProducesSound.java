package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicProducesSound extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicProducesSound currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicProducesSound.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicProducesSoundIterator theElectronic = (ElectronicProducesSoundIterator)findAncestorWithClass(this, ElectronicProducesSoundIterator.class);
			pageContext.getOut().print(theElectronic.getProducesSound());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for producesSound tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for producesSound tag ");
		}
		return SKIP_BODY;
	}
}

